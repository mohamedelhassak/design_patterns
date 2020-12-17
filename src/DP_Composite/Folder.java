package DP_Composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Folder extends Component{

    private List<Component> items = new ArrayList();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        String tab = indentation();
        System.out.println(tab+"Folder :"+name);
        for (Component c:items){
            c.afficher();
        }
    }

    public Component addComponent(Component c){
        c.level=this.level + 1;
        items.add(c);
        return c;
    }

}
