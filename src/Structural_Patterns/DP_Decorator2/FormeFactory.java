package Structural_Patterns.DP_Decorator2;

import Structural_Patterns.DP_Decorator2.forms.Caree;
import Structural_Patterns.DP_Decorator2.forms.Circle;
import Structural_Patterns.DP_Decorator2.forms.Forme;
import Structural_Patterns.DP_Decorator2.forms.Rectangle;

public class FormeFactory {
    public static final String TYPE_CIRCLE = "circle";
    public static final String TYPE_CAREE = "caree";
    public static final String TYPE_RECTANGLE = "rectangle";

    Forme createForme(String type) {
        switch (type) {

            case TYPE_CAREE:
                return new Caree();

            case TYPE_RECTANGLE:
                return new Rectangle();

            default:
                return new Circle();
        }
    }
}
