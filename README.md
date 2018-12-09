# spb-exception-handler

一、@ExceptionHandler(value = Exception.class)
1、在Controller类中，添加有@ExceptionHandler这个注解的方法，可以处理这个Controller的异常

二、添加父类
写父类Controller,有@ExceptionHandler这个注解，以后其他controller类从父类继承，也可以处理异常

三、@ControllerAdvice 注解，可以对整个项目进行异常处理

    @ControllerAdvice
    public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object globalErrorHandler(HttpServletRequest request, Exception e) throws Exception {
        
