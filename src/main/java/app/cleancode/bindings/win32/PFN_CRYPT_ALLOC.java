// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CRYPT_ALLOC {

    java.lang.foreign.Addressable apply(long cbSize);
    static MemorySegment allocate(PFN_CRYPT_ALLOC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_ALLOC.class, fi, constants$573.PFN_CRYPT_ALLOC$FUNC, session);
    }
    static PFN_CRYPT_ALLOC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _cbSize) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$573.PFN_CRYPT_ALLOC$MH.invokeExact((Addressable)symbol, _cbSize);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


