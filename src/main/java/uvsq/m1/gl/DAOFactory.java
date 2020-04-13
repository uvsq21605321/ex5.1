package uvsq.m1.gl;

public class DAOFactory {
	public static DAO<Annuaire> getAnnuaireDAO(){

        return new AnnuaireDAO();
    }


}
