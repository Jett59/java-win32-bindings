// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LINEDDAPROC {

    void apply(int _x0, int _x1, long _x2);
    static MemorySegment allocate(LINEDDAPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LINEDDAPROC.class, fi, constants$263.LINEDDAPROC$FUNC, session);
    }
    static LINEDDAPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, int __x1, long __x2) -> {
            try {
                constants$263.LINEDDAPROC$MH.invokeExact((Addressable)symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


