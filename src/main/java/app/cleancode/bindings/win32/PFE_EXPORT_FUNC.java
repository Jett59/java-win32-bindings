// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFE_EXPORT_FUNC {

    int apply(java.lang.foreign.MemoryAddress pbData, java.lang.foreign.MemoryAddress pvCallbackContext, int ulLength);
    static MemorySegment allocate(PFE_EXPORT_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFE_EXPORT_FUNC.class, fi, constants$197.PFE_EXPORT_FUNC$FUNC, session);
    }
    static PFE_EXPORT_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pbData, java.lang.foreign.MemoryAddress _pvCallbackContext, int _ulLength) -> {
            try {
                return (int)constants$197.PFE_EXPORT_FUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pbData, (java.lang.foreign.Addressable)_pvCallbackContext, _ulLength);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


