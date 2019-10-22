/*import javax.swing.*;
//основной класс от которого наследуется каждый класс, который хочет быть окном
//
public class MainWindow extends JFrame {
    public MainWindow()
    {
        setTitle("Змейка");//титульная страница (ОГЛАВЛЕНИЕ )
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//ЗАКРЫВАЕМ НА КРЕСТИК
       setSize( 320,345);// размер окна 345 так как сверху белая грань занимает 25 (особенность мака)
       setLocation(400,400);//
       add(new GameField());//подключаем наш класс
       setVisible(true);
    }
    public static void main(String[] args)
    {
        MainWindow mw =new MainWindow();
    }
}

import javax.swing.*;

/**
 * Created by infuntis on 15/01/17.
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}