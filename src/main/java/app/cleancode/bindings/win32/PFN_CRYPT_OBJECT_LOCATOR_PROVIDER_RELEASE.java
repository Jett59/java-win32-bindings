// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE {

    void apply(int dwReason, java.lang.foreign.MemoryAddress pPluginContext);
    static MemorySegment allocate(PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE.class, fi, constants$481.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE$FUNC, session);
    }
    static PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwReason, java.lang.foreign.MemoryAddress _pPluginContext) -> {
            try {
                constants$481.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE$MH.invokeExact((Addressable)symbol, _dwReason, (java.lang.foreign.Addressable)_pPluginContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


