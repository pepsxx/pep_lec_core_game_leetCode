package Pp_T03.Pp_L41_Annotation_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) // Аннотация буде использоваться даже в работе кода  и можно буде использовать рефлексию.
public @interface Pa_MethodInfo_2 {
    String pmSt_author() default "Pep_Sxx";
    int pgi_dateOfCreation() default 2019;
    String pgSt_cursor();
}
