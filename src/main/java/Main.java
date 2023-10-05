public class Main {

    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository(); //создаем пустой репозиторий

        try { //try говорим джаве что попытайся выполнить, если try выполнится без ошибок, то catch не будет выполнятся!
            repo.removeById(-100);
            //System.out.println("Hello!");
        } catch (NegativeArraySizeException e) { //catch значит поймай, catch будет исполнятся если try завершиться ошибкой и программа пойдет исполняться дальше
            System.out.println("ERROR");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
