// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PM_COLLECT_PROC {

    int apply(java.lang.foreign.MemoryAddress lpValueName, java.lang.foreign.MemoryAddress lppData, java.lang.foreign.MemoryAddress lpcbTotalBytes, java.lang.foreign.MemoryAddress lpNumObjectTypes);
    static MemorySegment allocate(PM_COLLECT_PROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PM_COLLECT_PROC.class, fi, constants$404.PM_COLLECT_PROC$FUNC, session);
    }
    static PM_COLLECT_PROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _lpValueName, java.lang.foreign.MemoryAddress _lppData, java.lang.foreign.MemoryAddress _lpcbTotalBytes, java.lang.foreign.MemoryAddress _lpNumObjectTypes) -> {
            try {
                return (int)constants$404.PM_COLLECT_PROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_lpValueName, (java.lang.foreign.Addressable)_lppData, (java.lang.foreign.Addressable)_lpcbTotalBytes, (java.lang.foreign.Addressable)_lpNumObjectTypes);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


