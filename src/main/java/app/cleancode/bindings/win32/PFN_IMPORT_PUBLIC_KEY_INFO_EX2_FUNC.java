// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC {

    int apply(int dwCertEncodingType, java.lang.foreign.MemoryAddress pInfo, int dwFlags, java.lang.foreign.MemoryAddress pvAuxInfo, java.lang.foreign.MemoryAddress phKey);
    static MemorySegment allocate(PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC.class, fi, constants$615.PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC$FUNC, session);
    }
    static PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwCertEncodingType, java.lang.foreign.MemoryAddress _pInfo, int _dwFlags, java.lang.foreign.MemoryAddress _pvAuxInfo, java.lang.foreign.MemoryAddress _phKey) -> {
            try {
                return (int)constants$615.PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC$MH.invokeExact((Addressable)symbol, _dwCertEncodingType, (java.lang.foreign.Addressable)_pInfo, _dwFlags, (java.lang.foreign.Addressable)_pvAuxInfo, (java.lang.foreign.Addressable)_phKey);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


