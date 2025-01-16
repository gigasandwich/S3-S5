package dao;

import modele.Composant;
import java.sql.*;

public class ComposantDao extends GenericDaoImpl<Composant> {
    public ComposantDao() {
        super("composant", "id_composant");
    }

    @Override
    protected Composant resultSetToEntity(ResultSet rs) throws SQLException {
        return new Composant(rs.getString("marque"), rs.getString("modele"), rs.getString("processeur"), rs.getString("ram"), rs.getFloat("stockage"), rs.getString("type_ordinateur"));
    }

    @Override
    protected void entityToPreparedStatement(Composant composant, PreparedStatement ps) throws SQLException {
        ps.setString(1, composant.getMarque());
        ps.setString(2, composant.getModele());
        ps.setString(3, composant.getProcesseur());
        ps.setString(4, composant.getRam());
        ps.setFloat(5, composant.getStockage());
        ps.setString(6, composant.getTypeOrdinateur());
    }

    @Override
    protected String[] getInsertColumnsArray() {
        return new String[]{"marque", "modele", "processeur", "ram", "stockage", "type_ordinateur"};
    }

    @Override
    protected int getIdFromEntity(Composant composant) {
        return composant.getIdComposant();
    }
}
