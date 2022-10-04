// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CMSG_EXPORT_KEY_TRANS {

    int apply(java.lang.foreign.MemoryAddress pContentEncryptInfo, java.lang.foreign.MemoryAddress pKeyTransEncodeInfo, java.lang.foreign.MemoryAddress pKeyTransEncryptInfo, int dwFlags, java.lang.foreign.MemoryAddress pvReserved);
    static MemorySegment allocate(PFN_CMSG_EXPORT_KEY_TRANS fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CMSG_EXPORT_KEY_TRANS.class, fi, constants$430.PFN_CMSG_EXPORT_KEY_TRANS$FUNC, session);
    }
    static PFN_CMSG_EXPORT_KEY_TRANS ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pContentEncryptInfo, java.lang.foreign.MemoryAddress _pKeyTransEncodeInfo, java.lang.foreign.MemoryAddress _pKeyTransEncryptInfo, int _dwFlags, java.lang.foreign.MemoryAddress _pvReserved) -> {
            try {
                return (int)constants$430.PFN_CMSG_EXPORT_KEY_TRANS$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pContentEncryptInfo, (java.lang.foreign.Addressable)_pKeyTransEncodeInfo, (java.lang.foreign.Addressable)_pKeyTransEncryptInfo, _dwFlags, (java.lang.foreign.Addressable)_pvReserved);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


