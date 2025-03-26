import java.util.ArrayList;

public class EmpleadoDAO implements IEmpleadoDAO {
    // Aqui se implementa la logica para manejar empleados en memoria o base de datos
    private ArrayList<Empleado> empleados;

    public EmpleadoDAO() {
        this.empleados = new ArrayList<>();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        // Implementar
        this.empleados.add(empleado);
    }
    @Override
    public Empleado obtenerEmpleado(String nombre) {
        // Implementar
        for(int i = 0; i < empleados.size(); i++){
            Empleado empleado = empleados.get(i);
            if(empleado.getNombre().equals(nombre)){
                return empleado;
            }
        }
        return null;
    }
    @Override
    public void eliminarEmpleado(String nombre) {
        // Implementar
        for(int i = 0; i < empleados.size(); i++){
            Empleado empleado = empleados.get(i);
            if(empleado.getNombre().equals(nombre)){
                empleados.remove(i);
            }
        }
    }
    @Override
    public void actualizarEmpleado(Empleado empleado) {
        // Implementar
        for(int i = 0; i < empleados.size(); i++){
            Empleado empleado2 = empleados.get(i);
            if(empleado2.getNombre().equals(empleado.getNombre())){
                empleados.set(i, empleado);
            }
        }
    }
}