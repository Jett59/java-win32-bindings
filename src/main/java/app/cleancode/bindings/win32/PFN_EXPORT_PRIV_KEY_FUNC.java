// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_EXPORT_PRIV_KEY_FUNC {

    int apply(long hCryptProv, int dwKeySpec, java.lang.foreign.MemoryAddress pszPrivateKeyObjId, int dwFlags, java.lang.foreign.MemoryAddress pvAuxInfo, java.lang.foreign.MemoryAddress pPrivateKeyInfo, java.lang.foreign.MemoryAddress pcbPrivateKeyInfo);
    static MemorySegment allocate(PFN_EXPORT_PRIV_KEY_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_EXPORT_PRIV_KEY_FUNC.class, fi, constants$616.PFN_EXPORT_PRIV_KEY_FUNC$FUNC, session);
    }
    static PFN_EXPORT_PRIV_KEY_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _hCryptProv, int _dwKeySpec, java.lang.foreign.MemoryAddress _pszPrivateKeyObjId, int _dwFlags, java.lang.foreign.MemoryAddress _pvAuxInfo, java.lang.foreign.MemoryAddress _pPrivateKeyInfo, java.lang.foreign.MemoryAddress _pcbPrivateKeyInfo) -> {
            try {
                return (int)constants$616.PFN_EXPORT_PRIV_KEY_FUNC$MH.invokeExact((Addressable)symbol, _hCryptProv, _dwKeySpec, (java.lang.foreign.Addressable)_pszPrivateKeyObjId, _dwFlags, (java.lang.foreign.Addressable)_pvAuxInfo, (java.lang.foreign.Addressable)_pPrivateKeyInfo, (java.lang.foreign.Addressable)_pcbPrivateKeyInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


