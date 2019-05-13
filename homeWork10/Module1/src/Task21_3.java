public class Task21_3 {
    public static void main(String[] args) {
        String a1 = "Устная передача";
        String a2 = "самый древний способ передачи";
        String a3 = "знаний в истории человечества";
        String a4 = "Книга один из видов печатной продукции";
        String a5 = a1 + a2 + a3 + a4;
        StringBuffer stringBuffer = new StringBuffer(a5);
        for (int i = 0; i < 50; i++) {
            System.out.println();
            System.out.println(stringBuffer.append(a5));

        }
    }
}
//Вывод:StringBuffer сработал быстрее всех