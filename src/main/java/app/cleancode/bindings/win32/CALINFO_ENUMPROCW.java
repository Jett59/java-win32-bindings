// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface CALINFO_ENUMPROCW {

    int apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(CALINFO_ENUMPROCW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(CALINFO_ENUMPROCW.class, fi, constants$461.CALINFO_ENUMPROCW$FUNC, session);
    }
    static CALINFO_ENUMPROCW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (int)constants$461.CALINFO_ENUMPROCW$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


