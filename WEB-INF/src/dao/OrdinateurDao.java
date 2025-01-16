package dao;

import modele.Ordinateur;
import java.sql.*;

public class OrdinateurDao extends GenericDaoImpl<Ordinateur> {
    public OrdinateurDao() {
        super("ordinateur", "id_ordinateur");
    }

    @Override
    protected Ordinateur resultSetToEntity(ResultSet rs) throws SQLException {
        return new Ordinateur(rs.getInt("id_ordinateur"), rs.getString("numero_serie"), rs.getInt("id_client"), rs.getInt("id_ram"), rs.getInt("id_processeur"), rs.getInt("id_type_ordinateur"), rs.getInt("id_modele") /*, rs.getFloat("stockage") */);
    }

    @Override
    protected void entityToPreparedStatement(Ordinateur ordinateur, PreparedStatement ps) throws SQLException {
        ps.setString(1, ordinateur.getNumeroSerie());
        ps.setInt(2, ordinateur.getIdClient());
        ps.setInt(3, ordinateur.getIdRam());
        ps.setInt(4, ordinateur.getIdProcesseur());
        ps.setInt(5, ordinateur.getIdTypeOrdinateur());
        ps.setInt(6, ordinateur.getIdModele());
        // ps.setFloat(7, ordinateur.getStockage());
    }

    @Override
    protected String[] getInsertColumnsArray() {
        return new String[]{"numero_serie", "id_client", "id_ram", "id_processeur", "id_type_ordinateur", "id_modele" /*, "stockage" */};
    }

    @Override
    protected int getIdFromEntity(Ordinateur ordinateur) {
        return ordinateur.getIdOrdinateur();
    }
}
