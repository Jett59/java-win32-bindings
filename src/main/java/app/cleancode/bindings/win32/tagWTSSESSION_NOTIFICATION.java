// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagWTSSESSION_NOTIFICATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwSessionId")
    ).withName("tagWTSSESSION_NOTIFICATION");
    public static MemoryLayout $LAYOUT() {
        return tagWTSSESSION_NOTIFICATION.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagWTSSESSION_NOTIFICATION.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagWTSSESSION_NOTIFICATION.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagWTSSESSION_NOTIFICATION.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagWTSSESSION_NOTIFICATION.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagWTSSESSION_NOTIFICATION.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSessionId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSessionId"));
    public static VarHandle dwSessionId$VH() {
        return tagWTSSESSION_NOTIFICATION.dwSessionId$VH;
    }
    public static int dwSessionId$get(MemorySegment seg) {
        return (int)tagWTSSESSION_NOTIFICATION.dwSessionId$VH.get(seg);
    }
    public static void dwSessionId$set( MemorySegment seg, int x) {
        tagWTSSESSION_NOTIFICATION.dwSessionId$VH.set(seg, x);
    }
    public static int dwSessionId$get(MemorySegment seg, long index) {
        return (int)tagWTSSESSION_NOTIFICATION.dwSessionId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSessionId$set(MemorySegment seg, long index, int x) {
        tagWTSSESSION_NOTIFICATION.dwSessionId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


