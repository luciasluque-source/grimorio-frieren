public static int[][] generarMatriz (int filas, int columna){ //creamos una funcion que genera matrices aleatorias
    int numGenerador = 10;  //es el limite superior para generar numeros aleatorios;
    int matriz[][] = new int[filas][columna]; // crea la matriz;

    for (int i = 0; i < filas; i++){  //inica el bucle que recorre las filas de la matriz;
        for (int j = 0; j < columna; j++){//inica el bucle que recorre las columnas de la matriz;
            int numero = (int)(Math.random() * numGenerador) + 1; //crea el numero aleatorio que va de 1 a 9;
            matriz[i][j] = numero; //se guarda el numero en una posicion especifica;
        }
    }//hola caracola
    return matriz; //devuelve la matriz aleatorio;
}


public static int[][] multiplicarMatrizRecursivo(int[][] matriz1, int[][]matriz2, int [][] resul, int i, int j, int k){ //resul reccoge la matriz resultado, i son las filas, j las columnas y k es un metodo auxiliar que utilizaremos de indice para calcular el producto escalar entre una fila de la primera matriz y la columna de la segunda;
    int filas1 = matriz1.length;
    int columnas1 = matriz1[0].length;
    int columnas2 = matriz2[0].length;

}
void main() {
}