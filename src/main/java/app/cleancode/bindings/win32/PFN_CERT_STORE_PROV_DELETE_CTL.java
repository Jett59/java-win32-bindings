// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_STORE_PROV_DELETE_CTL {

    int apply(java.lang.foreign.MemoryAddress hStoreProv, java.lang.foreign.MemoryAddress pCtlContext, int dwFlags);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_DELETE_CTL fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_DELETE_CTL.class, fi, constants$437.PFN_CERT_STORE_PROV_DELETE_CTL$FUNC, session);
    }
    static PFN_CERT_STORE_PROV_DELETE_CTL ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hStoreProv, java.lang.foreign.MemoryAddress _pCtlContext, int _dwFlags) -> {
            try {
                return (int)constants$438.PFN_CERT_STORE_PROV_DELETE_CTL$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hStoreProv, (java.lang.foreign.Addressable)_pCtlContext, _dwFlags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


