// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK {

    int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
    static MemorySegment allocate(POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK.class, fi, constants$7.POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$FUNC, session);
    }
    static POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
            try {
                return (int)constants$7.POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


