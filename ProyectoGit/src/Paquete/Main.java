package Paquete;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear el repositorio local en la vista Git
		 * Click Der > Team... > Share > Seleccionar el repositorio creado
		 * Window > References > Team > Git > Label Decoration (Representacion de los comandos Git, componentes, estado de los archivos...)
		 * */
		/*
		 * Conexion a repositorio remoto
		 * Click Der > Team... > Remote > Push > URI Host y Repository pack automatico si se copia antes el enlace al repositorio >
		 * Add Specification > Master [Branch] > + Add specification > Finish > Credenciales
		 * */
		/*
		 * Nueva rama
		 * Vista Git > Click Der Branches > Switch to... > New Branch > NombreRama
		 * Cambiar de rama (Checkout): Branches > Local > Doble click NombreRama
		 * 
		 * Cuando se cambia a una rama si se crean clases nuevas se crean dentro de ella
		 * 
		 * Fusionar ramas: cambiar a master (checkout) > Clic Der rama > Merge... > Seleccionar rama a fusionar > Merge
		 * 
		 * Subir rama al repositorio remoto: Click Der NombreRama > Push Branch...
		 * 
		 * Conflicto: clonar el repositorio actual en otro. Modificar el mismo archivo desde los dos repositorios en master y subir al remoto
		 * 
		 * 
		 * 
		 * */
		System.out.println("Hola mundo");
		System.out.println("Hola mundo 2");
		System.out.println("Hola mundo rama Prueba");
		System.out.println("Hola mundo 2 rama Prueba");
	}

}
