// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface DATEFMT_ENUMPROCEXA {

    int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
    static MemorySegment allocate(DATEFMT_ENUMPROCEXA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(DATEFMT_ENUMPROCEXA.class, fi, constants$353.DATEFMT_ENUMPROCEXA$FUNC, session);
    }
    static DATEFMT_ENUMPROCEXA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
            try {
                return (int)constants$353.DATEFMT_ENUMPROCEXA$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


