// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_STORE_PROV_CONTROL {

    int apply(java.lang.foreign.MemoryAddress hStoreProv, int dwFlags, int dwCtrlType, java.lang.foreign.MemoryAddress pvCtrlPara);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_CONTROL fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_CONTROL.class, fi, constants$590.PFN_CERT_STORE_PROV_CONTROL$FUNC, session);
    }
    static PFN_CERT_STORE_PROV_CONTROL ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hStoreProv, int _dwFlags, int _dwCtrlType, java.lang.foreign.MemoryAddress _pvCtrlPara) -> {
            try {
                return (int)constants$590.PFN_CERT_STORE_PROV_CONTROL$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hStoreProv, _dwFlags, _dwCtrlType, (java.lang.foreign.Addressable)_pvCtrlPara);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


