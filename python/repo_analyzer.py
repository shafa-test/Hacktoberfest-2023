import os
import subprocess
import csv
from prettytable import PrettyTable

def analyze_repo(repo_path):
    os.chdir(repo_path)

    # Get contributors
    contributors = subprocess.check_output(['git', 'shortlog', '-sne', '--all']).decode().split('\n')
    contributors = [c.strip() for c in contributors if c]

    # Get total lines
    p1 = subprocess.Popen(['git', 'ls-files'], stdout=subprocess.PIPE)
    p2 = subprocess.Popen(['xargs', 'wc', '-l'], stdin=p1.stdout, stdout=subprocess.PIPE)
    p1.stdout.close()  # Allow p1 to receive a SIGPIPE if p2 exits.
    output = p2.communicate()[0]
    total_lines = sum(int(line.split()[0]) for line in output.decode().split('\n') if line)

    return {
        'contributors': contributors,
        'total_lines': total_lines
    }



import csv
from prettytable import PrettyTable

def analyze_repos(repo_paths):
    table = PrettyTable()
    table.field_names = ["Repository", "Total Lines", "Contributor"]

    for repo_path in repo_paths:
        print(f'Analyzing {repo_path}...')
        result = analyze_repo(repo_path)
        for contributor in result["contributors"]:  # Add a row for each contributor
            table.add_row([repo_path, result["total_lines"], contributor])

    print(table)

    # Write to CSV
    # with open('repo_analysis.csv', 'w', newline='') as file:
    #     writer = csv.writer(file)
    #     writer.writerow(["Repository", "Total Lines", "Contributor"])
    #     for row in table:
    #         writer.writerow(row)

    # print("CSV file has been created as 'repo_analysis.csv'")

# List of local repositories
repos = ['../integration-service']
analyze_repos(repos)