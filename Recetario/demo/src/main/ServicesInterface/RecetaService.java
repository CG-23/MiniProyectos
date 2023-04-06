public interface RecetaService {
    public Receta newReceta(Receta Receta);
    public Receta updateReceta(Receta Receta);
    public List<Receta> getAllRecetas();
    public void deleteReceta(Integer pk_RecetaId);
}
