package Pp_T03.Pp_L41_Annotation_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Pa_MethodInfo_1 {
    String pmSt_author();
    int pgi_dateOfCreation();
    String pgSt_cursor();
}
