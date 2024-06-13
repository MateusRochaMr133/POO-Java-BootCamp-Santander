public class main {

    public static void main(String[] args) {
        System.out.println("Hello Word!");

        /* Byte = -128 ate 127 */
        byte variavelByte = 127;

        /* Short - -32768 a 32767 */
        /* Char - 0 a 65535 */
        /* Int - -2bilhoes a 2bilhoes */
        /* Long - -9t a 9t */

        int variavelInt = 214783;

        System.out.println(variavelInt);

    }

}

/*
 * Para conseguir rodar um projeto em java precisamos criar um metodo main, são
 * 5 caracteristicas que esse metodo precisa ter:
 * 1°Precisa ser publico, todo mundo tem acesso,
 * 2°Precisa ser static,
 * 3°Não retorne valor nenhum - void,
 * 4°Obrigatoriamente ter o nome main,
 * 5°Vai receber como parametro um array ou um var strings
 */
/* A JVM vai procurar sempre o metodo main, sempre vai começar por ele */

/*
 * Var args de string serve para deifinir quantas variaveis que agente vai
 * receber neste metodo
 */