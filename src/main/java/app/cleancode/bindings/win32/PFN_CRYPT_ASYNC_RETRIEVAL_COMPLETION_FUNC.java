// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC {

    void apply(java.lang.foreign.MemoryAddress pvCompletion, int dwCompletionCode, java.lang.foreign.MemoryAddress pszUrl, java.lang.foreign.MemoryAddress pszObjectOid, java.lang.foreign.MemoryAddress pvObject);
    static MemorySegment allocate(PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC.class, fi, constants$625.PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC$FUNC, session);
    }
    static PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pvCompletion, int _dwCompletionCode, java.lang.foreign.MemoryAddress _pszUrl, java.lang.foreign.MemoryAddress _pszObjectOid, java.lang.foreign.MemoryAddress _pvObject) -> {
            try {
                constants$625.PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pvCompletion, _dwCompletionCode, (java.lang.foreign.Addressable)_pszUrl, (java.lang.foreign.Addressable)_pszObjectOid, (java.lang.foreign.Addressable)_pvObject);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


