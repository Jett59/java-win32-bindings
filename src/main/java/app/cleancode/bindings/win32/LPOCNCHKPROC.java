// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPOCNCHKPROC {

    int apply(long _x0, long _x1, java.lang.foreign.MemoryAddress _x2);
    static MemorySegment allocate(LPOCNCHKPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPOCNCHKPROC.class, fi, constants$656.LPOCNCHKPROC$FUNC, session);
    }
    static LPOCNCHKPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long __x0, long __x1, java.lang.foreign.MemoryAddress __x2) -> {
            try {
                return (int)constants$656.LPOCNCHKPROC$MH.invokeExact((Addressable)symbol, __x0, __x1, (java.lang.foreign.Addressable)__x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


