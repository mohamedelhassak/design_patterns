package DP_Composite;

public class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        String tab = indentation();
        System.out.println(tab+"File :"+name);
    }
}
