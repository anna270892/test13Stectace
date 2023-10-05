public class NegativeIdException extends RuntimeException {

    public NegativeIdException(String msg) { //создадим контруктор который будет принимать сообщение об ошибке и передавать его в основной класс
        super(msg);
    }
}
