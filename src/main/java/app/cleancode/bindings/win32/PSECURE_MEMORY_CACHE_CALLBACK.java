// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PSECURE_MEMORY_CACHE_CALLBACK {

    byte apply(java.lang.foreign.MemoryAddress Addr, long Range);
    static MemorySegment allocate(PSECURE_MEMORY_CACHE_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PSECURE_MEMORY_CACHE_CALLBACK.class, fi, constants$65.PSECURE_MEMORY_CACHE_CALLBACK$FUNC, session);
    }
    static PSECURE_MEMORY_CACHE_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Addr, long _Range) -> {
            try {
                return (byte)constants$65.PSECURE_MEMORY_CACHE_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Addr, _Range);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


