// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PCOPYFILE2_PROGRESS_ROUTINE {

    int apply(java.lang.foreign.MemoryAddress pMessage, java.lang.foreign.MemoryAddress pvCallbackContext);
    static MemorySegment allocate(PCOPYFILE2_PROGRESS_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PCOPYFILE2_PROGRESS_ROUTINE.class, fi, constants$121.PCOPYFILE2_PROGRESS_ROUTINE$FUNC, session);
    }
    static PCOPYFILE2_PROGRESS_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pMessage, java.lang.foreign.MemoryAddress _pvCallbackContext) -> {
            try {
                return (int)constants$121.PCOPYFILE2_PROGRESS_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pMessage, (java.lang.foreign.Addressable)_pvCallbackContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


