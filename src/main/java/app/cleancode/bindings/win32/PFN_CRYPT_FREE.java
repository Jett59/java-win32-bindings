// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CRYPT_FREE {

    void apply(java.lang.foreign.MemoryAddress pv);
    static MemorySegment allocate(PFN_CRYPT_FREE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_FREE.class, fi, constants$421.PFN_CRYPT_FREE$FUNC, session);
    }
    static PFN_CRYPT_FREE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pv) -> {
            try {
                constants$421.PFN_CRYPT_FREE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pv);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


