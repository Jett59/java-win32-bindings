// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DELETE_USN_JOURNAL_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("UsnJournalID"),
        Constants$root.C_LONG$LAYOUT.withName("DeleteFlags"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return DELETE_USN_JOURNAL_DATA.$struct$LAYOUT;
    }
    static final VarHandle UsnJournalID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UsnJournalID"));
    public static VarHandle UsnJournalID$VH() {
        return DELETE_USN_JOURNAL_DATA.UsnJournalID$VH;
    }
    public static long UsnJournalID$get(MemorySegment seg) {
        return (long)DELETE_USN_JOURNAL_DATA.UsnJournalID$VH.get(seg);
    }
    public static void UsnJournalID$set( MemorySegment seg, long x) {
        DELETE_USN_JOURNAL_DATA.UsnJournalID$VH.set(seg, x);
    }
    public static long UsnJournalID$get(MemorySegment seg, long index) {
        return (long)DELETE_USN_JOURNAL_DATA.UsnJournalID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UsnJournalID$set(MemorySegment seg, long index, long x) {
        DELETE_USN_JOURNAL_DATA.UsnJournalID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeleteFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeleteFlags"));
    public static VarHandle DeleteFlags$VH() {
        return DELETE_USN_JOURNAL_DATA.DeleteFlags$VH;
    }
    public static int DeleteFlags$get(MemorySegment seg) {
        return (int)DELETE_USN_JOURNAL_DATA.DeleteFlags$VH.get(seg);
    }
    public static void DeleteFlags$set( MemorySegment seg, int x) {
        DELETE_USN_JOURNAL_DATA.DeleteFlags$VH.set(seg, x);
    }
    public static int DeleteFlags$get(MemorySegment seg, long index) {
        return (int)DELETE_USN_JOURNAL_DATA.DeleteFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeleteFlags$set(MemorySegment seg, long index, int x) {
        DELETE_USN_JOURNAL_DATA.DeleteFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


