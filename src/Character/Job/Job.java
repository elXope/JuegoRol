package Character.Job;

import Character.Stat.Stat;

public abstract class Job {
    public abstract int modifier(Stat stat);

    @Override
    public boolean equals(Object obj) {
        return this.getClass().getSimpleName().equals(obj.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
