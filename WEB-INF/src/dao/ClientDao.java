package dao;

import modele.Client;
import java.sql.*;

public class ClientDao extends GenericDaoImpl<Client> {
    public ClientDao() {
        super("client", "id_client");
    }

    @Override
    protected Client resultSetToEntity(ResultSet rs) throws SQLException {
        return new Client(rs.getInt("id_client"), rs.getString("nom_client"), rs.getString("contact"));
    }

    @Override
    protected void entityToPreparedStatement(Client client, PreparedStatement ps) throws SQLException {
        ps.setString(1, client.getNom());
        ps.setString(2, client.getContact());
    }

    @Override
    protected String[] getInsertColumnsArray() {
        return new String[]{"nom_client", "contact"};
    }

    @Override
    protected int getIdFromEntity(Client client) {
        return client.getId();
    }
}