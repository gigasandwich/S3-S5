package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import connection.ConnectionPostgres;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {
    protected abstract T resultSetToEntity(ResultSet rs) throws SQLException;
    protected abstract void entityToPreparedStatement(T entity, PreparedStatement ps) throws SQLException;
    protected abstract String[] getInsertColumnsArray(); // eg: ["nom_client", "contact"]
    protected abstract int getIdFromEntity(T entity); // client.getId();

    private String tableName;
    private String idColumn; // Primary key

    public GenericDaoImpl(String tableName, String idColumn) {
        this.tableName = tableName;
        this.idColumn = idColumn;
    }
    
    /*
     * SELECT
     */
    @Override
    public List<T> selectAll() {
        List<T> entities = new ArrayList<>();

        String sql = "SELECT * FROM " + tableName;
        try (Connection conn = ConnectionPostgres.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                entities.add(resultSetToEntity(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return entities;
    }

    @Override
    public T select(int id) {
        String sql = "SELECT * FROM " + tableName + " WHERE " + idColumn + " = ?";
        try (Connection conn = ConnectionPostgres.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return resultSetToEntity(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     * INSERT
     */
    @Override
    public void insert(T entity) {
        String sql = "INSERT INTO " + tableName + " (" + getInsertColumns() + ") VALUES (" + getInsertPlaceholders() + ")";
        try (Connection conn = ConnectionPostgres.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            entityToPreparedStatement(entity, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected String getInsertColumns() {
        return String.join(", ", getInsertColumnsArray());
    }
    protected String getInsertPlaceholders() {
        int count = getInsertColumnsArray().length;
        return String.join(",", "?".repeat(count).split(""));
    }

    /*
     * UPDATE
     */
    @Override
    public void update(T oldEntity, T newEntity) {
        String[] columns = getInsertColumnsArray();
        String setClause = String.join(" = ?, ", columns) + " = ?";
        String sql = "UPDATE " + tableName + " SET " + setClause + " WHERE " + idColumn + " = ?";
        try (Connection conn = ConnectionPostgres.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            entityToPreparedStatement(newEntity, ps);
            ps.setInt(columns.length + 1, getIdFromEntity(oldEntity));
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * DELETE
     */
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM " + tableName + " WHERE " + idColumn + " = ?";
        try (Connection conn = ConnectionPostgres.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}