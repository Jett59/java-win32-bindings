// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_SC_NOTIFY_CALLBACK {

    void apply(java.lang.foreign.MemoryAddress pParameter);
    static MemorySegment allocate(PFN_SC_NOTIFY_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_SC_NOTIFY_CALLBACK.class, fi, constants$538.PFN_SC_NOTIFY_CALLBACK$FUNC, session);
    }
    static PFN_SC_NOTIFY_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pParameter) -> {
            try {
                constants$538.PFN_SC_NOTIFY_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


