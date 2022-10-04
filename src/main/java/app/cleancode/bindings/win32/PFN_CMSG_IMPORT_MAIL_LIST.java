// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CMSG_IMPORT_MAIL_LIST {

    int apply(java.lang.foreign.MemoryAddress pContentEncryptionAlgorithm, java.lang.foreign.MemoryAddress pMailListDecryptPara, int dwFlags, java.lang.foreign.MemoryAddress pvReserved, java.lang.foreign.MemoryAddress phContentEncryptKey);
    static MemorySegment allocate(PFN_CMSG_IMPORT_MAIL_LIST fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CMSG_IMPORT_MAIL_LIST.class, fi, constants$432.PFN_CMSG_IMPORT_MAIL_LIST$FUNC, session);
    }
    static PFN_CMSG_IMPORT_MAIL_LIST ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pContentEncryptionAlgorithm, java.lang.foreign.MemoryAddress _pMailListDecryptPara, int _dwFlags, java.lang.foreign.MemoryAddress _pvReserved, java.lang.foreign.MemoryAddress _phContentEncryptKey) -> {
            try {
                return (int)constants$432.PFN_CMSG_IMPORT_MAIL_LIST$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pContentEncryptionAlgorithm, (java.lang.foreign.Addressable)_pMailListDecryptPara, _dwFlags, (java.lang.foreign.Addressable)_pvReserved, (java.lang.foreign.Addressable)_phContentEncryptKey);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


