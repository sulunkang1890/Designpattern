package com.slk.gpproxy.Iproxy;
import com.slk.gpproxy.client.IHouse;
import java.lang.reflect.*;
public class $Proxy0 implements com.slk.gpproxy.client.IHouse{
GPInvocationHandler h;
public $Proxy0(GPInvocationHandler h) { 
this.h = h;}
public void saleHouse(java.lang.String string) {
try{
Method m = com.slk.gpproxy.client.IHouse.class.getMethod("saleHouse",new Class[]{java.lang.String.class});
this.h.invoke(this,m,new Object[]{string});
}catch(Error _ex) { }catch(Throwable e){
throw new UndeclaredThrowableException(e);
}}}
