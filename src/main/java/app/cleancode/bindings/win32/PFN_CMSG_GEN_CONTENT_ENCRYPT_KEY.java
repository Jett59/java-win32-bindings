// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY {

    int apply(java.lang.foreign.MemoryAddress pContentEncryptInfo, int dwFlags, java.lang.foreign.MemoryAddress pvReserved);
    static MemorySegment allocate(PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY.class, fi, constants$582.PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY$FUNC, session);
    }
    static PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pContentEncryptInfo, int _dwFlags, java.lang.foreign.MemoryAddress _pvReserved) -> {
            try {
                return (int)constants$582.PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pContentEncryptInfo, _dwFlags, (java.lang.foreign.Addressable)_pvReserved);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


