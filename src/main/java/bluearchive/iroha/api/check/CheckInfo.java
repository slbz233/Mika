package bluearchive.iroha.api.check;


public @interface CheckInfo {
    String name();

    String desc() default "";

    Category category();

    SubCategory subCategory();

    boolean experimental();

    boolean subCheck() default false;

    boolean silent() default false;

    String credits() default "";
}
