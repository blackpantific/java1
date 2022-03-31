package contracts;

public interface ISequence {
    default int defaultNext(){
        return 2;
    }
}
