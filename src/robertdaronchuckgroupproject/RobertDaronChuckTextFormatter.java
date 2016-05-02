package robertdaronchuckgroupproject;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Paint;

/**This class handles input number by the user in a right
to left manner. The numbers length is customizable either with
the the overloaded constructor or the setSize method.
*/

public class RobertDaronChuckTextFormatter extends TextField{
    
    //hold max length of number to take in chars counting decimal
    //default value is 7 eg 1000.00 7898.98 etc...
    private int size = 7;
    
    //ToolTip
    Tooltip tt= new Tooltip("Use numeric keys and backspace to edit.");
    
    /**
     * no arg constructor
     */
    RobertDaronChuckTextFormatter()
    {
        setText(null);
        setPromptText("0");
    }
    /*
    Size setting constructor
    */
    RobertDaronChuckTextFormatter(int size)
    {
        setPromptText("0");
        setText(null);
        this.size = size;
    }
    
    /*
    Size setting constructor and preference to set prompt on or off
    */
    RobertDaronChuckTextFormatter(int size, boolean sets)
    {
        if (sets)
        {
            setPromptText("0");
            
        }
        setText(null);
        this.size = size;
    }
    
    /**Handle double number input
     */
    public void sethandlerDbl(final TextField txtF){
        txtF.setTooltip(tt);
        txtF.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
            
                //start over on back space
                if(ke.getCode().equals(KeyCode.BACK_SPACE))
                    txtF.setText(null);
                
                String key = "";
                if  (ke.getText().matches("[0-9]"))
                { 
                    if (getLength() == 0)
                    {
                        key = ke.getText();
                        ke.consume();
                        setText(".0");
                        positionCaret(getLength());
                        setText(getText()+key);
                    }
                  else if (getLength() != size)
                    {
                        key = ke.getText();
                        ke.consume();
                        StringBuilder sb = new StringBuilder(getText());
                        sb.deleteCharAt(sb.indexOf("."));
                        sb.append(key);
                        sb.insert(sb.length()-2, '.');
                      
                        if(sb.length()== 5 && sb.charAt(0) == '0')
                            sb.deleteCharAt(0);
                          
                        setText(sb.toString());
                              
                    }
                
                
                }
                
            }
                
        });       
}
    /**Handle integer number input
     */
    public void sethandlerInt(final TextField txtF){
        txtF.setTooltip(tt);
        txtF.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
            
                //start over on back space
                if(ke.getCode().equals(KeyCode.BACK_SPACE))
                    txtF.setText(null);
                
                String key = "";
                if  (ke.getText().matches("[0-9]") && getLength() < size)
                { 
                    key = ke.getText();
                    ke.consume();
                    positionCaret(getLength());
                    if (txtF.getText() == null)
                        setText(key);
                    else
                        setText(getText()+key);
                }
                
            }
                
        });       
}
    
    public void setSize(int size)
    {
       this.size = size;
    }
    
    public int getSize()
    {
       return size;
    }

        
        
        

        
                
        
}