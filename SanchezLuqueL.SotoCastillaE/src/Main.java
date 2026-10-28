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
public static int[][] multiplicarMatrizRecursivo(int[][] matriz1, int[][]matriz2, int [][] resul, int i, int j, int k) { //resul reccoge la matriz resultado, i son las filas, j las columnas y k es un metodo auxiliar que utilizaremos de indice para calcular el producto escalar entre una fila de la primera matriz y la columna de la segunda;
   if(matriz1[0].length != matriz2.length ){
       throw new IllegalArgumentException("Dimesiones incompatibles para la multiplicación");
   }
   if (i == matriz1.length) {
        return resul;
    }
    if (k == matriz1.length) {
        if (j + 1 < matriz2.length) {
            return multiplicarMatrizRecursivo(matriz1, matriz2, resul, i, j + 1, 0);
        } else {
            return multiplicarMatrizRecursivo(matriz1, matriz2, resul, i + 1, 0, 0);
        }
    }
    resul[i][j] += matriz1[i][k] * matriz2[k][j];
    return multiplicarMatrizRecursivo(matriz1, matriz2, resul, i, j, k + 1);

public static int[][] multiplicarMatIterativo ( int[][] mat1, int[][] mat2)
{//funcion iterativa con 2 matrices como parametros
    int filas1 = mat1.length; //variable numero de filas matriz 1
    int columnas1 = mat1[0].length; //numero columnas matriz 1 y filas matriz2
    int columnas2 = mat2[0].length;//numero columnas matriz 2
    int[][] resul = new int[filas1][columnas2]; //instanciamos una nueva matriz resultado
    for (int i = 0; i < filas1; i++) { //recorre filas matriz 1
        for (int j = 0; j < columnas2; j++) { //recorre columnas matriz1 y filas matriz 2
            for (int k = 0; k < columnas1;k++) { // recorre columnas matriz 2
                resul[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
    return resul;
}
void main() {
}