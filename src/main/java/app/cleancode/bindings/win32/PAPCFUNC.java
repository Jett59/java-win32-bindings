// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PAPCFUNC {

    void apply(long Parameter);
    static MemorySegment allocate(PAPCFUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PAPCFUNC.class, fi, constants$62.PAPCFUNC$FUNC, session);
    }
    static PAPCFUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _Parameter) -> {
            try {
                constants$62.PAPCFUNC$MH.invokeExact((Addressable)symbol, _Parameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


