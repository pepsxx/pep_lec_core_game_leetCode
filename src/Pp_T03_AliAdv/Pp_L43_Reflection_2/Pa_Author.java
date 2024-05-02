package Pp_T03_AliAdv.Pp_L43_Reflection_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pa_Author {
    String pgSt_name();
    int pgi_dateOfCreation();
}
