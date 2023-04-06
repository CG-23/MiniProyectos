public interface IngredientesService {   public GamesDto launchDices(Integer idPlayer);
    public void deleteIngredientFromReceta(Integer pk_RecetaId);
    public List<Ingredientes> getRecetaIngredientes(Integer pk_RecetaId);
}