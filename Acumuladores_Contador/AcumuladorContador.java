

public class AcumuladorContador {
    
    public static void main(String[] args) {
        
        int [] notas = {1,2,3,4,5};
        // 2. Contador: Perminte saber cuántos estudiantes aprobaron
        int aprobados = 0;

        //3. Acumulador: Permite sumar todas las notas
        int suma = 0;

        //4. Recorremos todas las notas
        for (int i = 0; i < notas.length; i++) {
            //5. Acumulamos la nota
            suma+= notas[i];

            //6. Contamos si el estudiante aprobó
            if (notas [i] >= 3) {
                aprobados++;
            }
            
        }
        //5. Calculamos el promedio
        double promedio = (double) suma / notas.length;

        // 6. Mostramos Resultados
        System.out.println("===============================");
        System.out.println("      RESULTADO DEL CURSO      ");
        System.out.println("===============================");
        System.out.println("Total de notas: " + notas.length);
        System.out.println("Suma de las notas: " + suma);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + (notas.length - aprobados));
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("===================================");

        //7. Mensaje Final según el promedio 
        if (promedio >= 4.5) {
            System.out.println("Nivel del grupo EXCELENTE");
        } else if (promedio >= 3) {
            System.out.println("Nivel del grupo: APROBADO");
        } else {
            System.out.println("Nivel del grupo: DEBE MEJORAR");
        }
    }
}
