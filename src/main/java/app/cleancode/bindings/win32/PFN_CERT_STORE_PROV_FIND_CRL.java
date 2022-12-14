// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_STORE_PROV_FIND_CRL {

    int apply(java.lang.foreign.MemoryAddress hStoreProv, java.lang.foreign.MemoryAddress pFindInfo, java.lang.foreign.MemoryAddress pPrevCrlContext, int dwFlags, java.lang.foreign.MemoryAddress ppvStoreProvFindInfo, java.lang.foreign.MemoryAddress ppProvCrlContext);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_FIND_CRL fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_FIND_CRL.class, fi, constants$592.PFN_CERT_STORE_PROV_FIND_CRL$FUNC, session);
    }
    static PFN_CERT_STORE_PROV_FIND_CRL ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hStoreProv, java.lang.foreign.MemoryAddress _pFindInfo, java.lang.foreign.MemoryAddress _pPrevCrlContext, int _dwFlags, java.lang.foreign.MemoryAddress _ppvStoreProvFindInfo, java.lang.foreign.MemoryAddress _ppProvCrlContext) -> {
            try {
                return (int)constants$592.PFN_CERT_STORE_PROV_FIND_CRL$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hStoreProv, (java.lang.foreign.Addressable)_pFindInfo, (java.lang.foreign.Addressable)_pPrevCrlContext, _dwFlags, (java.lang.foreign.Addressable)_ppvStoreProvFindInfo, (java.lang.foreign.Addressable)_ppProvCrlContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


