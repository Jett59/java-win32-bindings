// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface EDITWORDBREAKPROCA {

    int apply(java.lang.foreign.MemoryAddress lpch, int ichCurrent, int cch, int code);
    static MemorySegment allocate(EDITWORDBREAKPROCA fi, MemorySession session) {
        return RuntimeHelper.upcallStub(EDITWORDBREAKPROCA.class, fi, constants$330.EDITWORDBREAKPROCA$FUNC, session);
    }
    static EDITWORDBREAKPROCA ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _lpch, int _ichCurrent, int _cch, int _code) -> {
            try {
                return (int)constants$330.EDITWORDBREAKPROCA$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_lpch, _ichCurrent, _cch, _code);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


